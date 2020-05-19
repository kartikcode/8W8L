    bmiTell :: (RealFloat a) => a -> String  
    bmiTell bmi  
        | bmi <= 18.5 = "You're underweight, you emo, you!"  
        | bmi <= 25.0 = "You're supposedly normal. Pffft, I bet you're ugly!"  
        | bmi <= 30.0 = "You're fat! Lose some weight, fatty!"  
        | otherwise   = "You're a whale, congratulations!"  

    factorial :: (Integral b) => b -> b
    factorial n
        | n==0 = 1
        | otherwise = n* factorial (n-1)
    
    max' :: (Ord a) => a -> a -> a
    max' a b
        | a>b      = a
        |otherwise = b
    
    initials :: String -> String -> String
    initials firstname lastname = [f] ++ "." ++ [l] ++ "."
        where (f:_) = firstname
              (l:_) = lastname
    
    cylinder :: (RealFloat a) => a -> a -> a
    cylinder r h =
        let sidearea= 2*pi*r*h
            toparea = pi*r^2
        in sidearea + 2*toparea 
    
    maximum' :: (Ord a) => [a] -> a
    maximum' []= error "maximum of empty list"
    maximum' (x:xs)
        | x > maxTail = x
        | otherwise = maxTail
        where maxTail= maximum' xs 
    
    applTwice :: (a->a) -> a -> a
    applTwice f x = f (f x)

    largestDivisible :: (Integral a) => a
    largestDivisible = head ( filter p [100000,99999..])
        where p x = mod x 3289 == 0

    string2int :: String -> Integer
    string2int x= x