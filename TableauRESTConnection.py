from tableau_tools import TableauRestApiConnection, Logger, TableauRestApiConnection36


class TableauRestConnection:
    server_url = 'https://casanalyticsp01.cas.org/'
    username = 'mll25'
    password = 'BobRoss1125!'
    site_content_url = 'EnterpriseSuccessDashboardLIVE_0/sheets/EnterpriseSuccessDashboardLIVE'

    connection = TableauRestApiConnection36(server_url, username, password)

    connection.signin()
    site_content_urls = connection.query_all_site_content_urls()
    print(site_content_urls)
