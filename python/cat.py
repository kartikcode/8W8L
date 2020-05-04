import sys
import os
import argparse

def validation(file_name):
    if not file_name.endswith('.txt'):
        print("Enter the correct file extension.")
        sys.exit(1)

    if not os.path.exists(file_name):
        print("You've entered the wrong file name.")
        sys.exit(1)

    
my_parser = argparse.ArgumentParser(description="Displaying the contents of a text file.")
my_parser.add_argument( 'filename',
                        type=str,
                        nargs='*',
                        help='If specified, use the file instead of searching '
                        )

my_parser.add_argument('-n',
                        '--number',
                        action='store_true',
                        help='show the contents with line number')

my_parser.add_argument('-r',
                        '--redirect',
                        action='store_true',
                        help='redirect contents of the file')

args = my_parser.parse_args()

if (args.redirect):
    source = args.filename[0]
    #print(source)
    destination = args.filename[1]
    #print(destination)
    with open(destination, 'w') as out_file:
        with open(source,'r') as source:
            for line in source:
                #print(line)
                out_file.write(line)

    

else:
    for file_name in args.filename:
        ##validation(file)
        print("File name: {}".format(file_name))
        with open(file_name,'r') as file:
            if (args.number):
                number=1
                for line in file:
                    print(number, " ", line)
                    number = number + 1
            else:
                for line in file:
                    print(line)
        print("####################")



