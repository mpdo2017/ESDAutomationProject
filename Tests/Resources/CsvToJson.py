import csv
import json


class CsvToJson:

    def __init__(self):
        self.csv_file = './TestData/FormulusData.csv'
        self.json_file = './TestData/FormulusDBdata.json'

    def convert_write_json(self, data, json_file):
        with open(json_file, "w") as json_file:
            json_file.write(json.dumps(data, sort_keys=False, indent=4, separators=(',', ': ')))
            json_file.write(json.dumps(data))

    def read_CSV(self, csv_file, json_file):
        csv_rows = []
        with open(csv_file) as csv_reader:
            reader = csv.DictReader(csv_reader)
            field = reader.fieldnames
            for row in reader:
                csv_rows.extend([{field[i]: row[field[i]] for i in range(len(field))}])
            self.convert_write_json(csv_rows, json_file)
