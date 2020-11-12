import unittest
from Tests.Resources.CsvToJson import CsvToJson


class FormulusDBTestCases(unittest.TestCase):


    def test_data(self):
        read_csv_json = CsvToJson()
        read_csv_json.read_CSV('../TestData/formulusData.csv', '../TestData/formulusDBdata.json')

    def test_formulus_graph_area_data(self):
        actual_result = 63000.00
        expected_result = round(63149.09, -3)
        self.assertEqual(actual_result, expected_result)


if __name__ == '__main__':
    unittest.main()
