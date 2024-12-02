package com.example.taskthree;

import java.io.IOException;

public class CompanyInfoFacade {
    public static Company getCompanyDetails(String website) throws IOException {
        Company companyFromPDL = PDLReader.getCompanyInfo(website);
        Company companyFromWebScraping = WebScrapingService.getCompanyInfo(website);
        Company companyFromBrandfetch = BrandfetchService.getCompanyInfo(website);

        String name = companyFromPDL.getName() != null ? companyFromPDL.getName()
                : (companyFromWebScraping.getName() != null ? companyFromWebScraping.getName() : companyFromBrandfetch.getName());

        String description = companyFromPDL.getDescription() != null ? companyFromPDL.getDescription()
                : (companyFromWebScraping.getDescription() != null ? companyFromWebScraping.getDescription() : companyFromBrandfetch.getDescription());

        String logo = companyFromPDL.getLogo() != null ? companyFromPDL.getLogo()
                : (companyFromWebScraping.getLogo() != null ? companyFromWebScraping.getLogo() : companyFromBrandfetch.getLogo());

        return new Company(name, description, logo);
    }
}
