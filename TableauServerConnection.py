# -*- coding: utf-8 -*-
"""Tableau Desktop Version 2019.4.3 ∙ Tableau Server Version 2019.1.16	"""
import os.path
from pprint import pprint
import tableauserverclient as TSC
import Tests


class TableauServerConnection:
    CSV_FILE_PATH = os.path.dirname(Tests.__file__)

    username = os.getenv('USERNAME')
    password = os.getenv('PASSWORD')
    server_url = os.getenv('SERVER_URL')

    tableau_auth = TSC.TableauAuth('mll25', 'BobRoss1125!')
    server = TSC.Server('https://casanalyticsp01.cas.org/')
    # Current server version : 3.3
    server.use_server_version()
    req_option = TSC.RequestOptions(pagesize=1000)
    image_req_option = TSC.ImageRequestOptions(imageresolution=TSC.ImageRequestOptions.Resolution.High)

    with server.auth.sign_in(tableau_auth):
        all_workbooks, pagination_item = server.workbooks.get()
        wfound = [workbook for workbook in all_workbooks if workbook.name == 'Enterprise Success Dashboard LIVE']
        pprint(vars(wfound[0]))
        wconnect = server.workbooks.get_by_id('94d2abea-bced-46d1-831c-edce132b2864')
        server.workbooks.populate_views(wconnect)
        vfound = [view for view in wconnect.views if len(view.name) > 0]
        view_item = vfound[2]
       # pprint(vars(vfound[2]))

        server.views.populate_image(view_item)
        with open(f'{CSV_FILE_PATH}/ESD.png', 'wb') as image:
            image.write(view_item.image)
