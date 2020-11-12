from needle.cases import NeedleTestCase
from selenium import webdriver
from needle.driver import NeedleChrome



class TestDashboardImages(NeedleTestCase):
    server_url = 'https://casanalyticsp01.cas.org'

    @classmethod
    def get_web_driver(cls):
        cls.driver = webdriver.Chrome(executable_path='C:User/mll25/home/mll25/chromedriver/chromedriver_win32/chromedriver.exe')
        return NeedleChrome(cls.driver)

    def test_esd_image(self):
        self.driver.get(self.server_url + '/EnterpriseSuccessDashboardLIVE_0/sheets/EnterpriseSuccessDashboardLIVE')
        esd_ss = self.driver.find_element_by_xpath('/html/body/table/tbody/tr[122]/td[2]/span[1]')
        self.assertScreenshot(esd_ss, './ESD.png')
