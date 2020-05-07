from_file, to_file = ARGV

#Extracting data from the input file
input= File.open(from_file)
indata=input.read()

#Check if the output file exists
flag= File.exists? to_file
if flag
	puts "The given file already exists."
else 
	puts "The required file does not exist. Creating #{to_file}..."
end

#Fancy code
puts "Ready to go! Click Ctrl+C to abort."
puts "Press Enter to proceed...."
STDIN.gets()

output= File.open(to_file,'w')
output.write(indata)

puts "Process completed successfully."

input.close()
output.close()


