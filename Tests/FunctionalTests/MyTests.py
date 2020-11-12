from needle.cases import NeedleTestCase
from needle.driver import NeedleChrome


class MyTests(NeedleTestCase):

    @classmethod
    def get_web_driver(cls):
        return NeedleChrome()
