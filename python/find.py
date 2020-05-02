import os
import sys
import argparse

def validate_dir(directory):
    if not os.path.isdir(directory):
        print("Specified directory does not exist.")
        sys.exit(1)

def validate_file(file_name):
    if not os.path.isfile(file_name):
        print("Specified file does not exist.")
        sys.exit(1)


parser = argparse.ArgumentParser(description="Finds a file with a specific name.")
parser.add_argument('directory',
                    action='store',
                    help='give the directory for searching file')

parser.add_argument('-n',
                    '--name',
                    action='store_true',
                    help='specify the search type')

parser.add_argument('-c',
                    '--case',
                    action='store_true',
                    help='make the search case insensitive')

parser.add_argument('filename',
                    action='store',
                    help='file name to search')

args = parser.parse_args()
validate_dir(args.directory)

if (args.name):
    print(" ls {}".format(os.getcwd()))
    dirs = os.listdir(args.directory)
    file_name = args.filename
    for file in dirs:
        if (args.case):
            if (file.lower() == file_name.lower()):
                print(file)
        else:
            if (file == file_name):
                print(file)