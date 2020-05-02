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
                        type=argparse.FileType('r'),
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
    destination = args.filename[1]
    with open(str(destination.name), 'w') as out_file:
        for line in source:
            out_file.write(line)

    

else:
    for file in args.filename:
        ##validation(file)
        print("File name: {}".format(file.name))
        if (args.number):
            number=1
            for line in file:
                print(number, " ", line)
                number = number + 1
        else:
            for line in file:
                print(line)
        print("####################")



