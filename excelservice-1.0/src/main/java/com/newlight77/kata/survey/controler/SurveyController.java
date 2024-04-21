package com.newlight77.kata.survey.controler;

import com.newlight77.kata.survey.client.CampaignClient;
import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.ExportCampaignService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {

    private final CampaignClient campaignClient;
    private final ExportCampaignService exportCampaignService;

    public SurveyController(final CampaignClient campaignClient,
                            final ExportCampaignService exportCampaignService) {
      this.campaignClient = campaignClient;
      this.exportCampaignService = exportCampaignService;
    }
    @PostMapping("/create")
    public void createSurvey(@RequestBody final Survey survey) {
        campaignClient.createSurvey(survey);
    }
    @GetMapping("/get")
    public Survey getSurvey(@RequestParam final String id) {
        return campaignClient.getSurvey(id);
    }
    @PostMapping("/campaign/create")
    public void createCampaign(@RequestBody final Campaign campaign) {
        campaignClient.createCampaign(campaign);
    }
    @GetMapping("/campaign/get")
    public Campaign getCampaign(@RequestParam final String id) {
        return campaignClient.getCampaign(id);
    }
    @PostMapping("/campaign/export")
    public void exportCampaign(@RequestParam final String campaignId) {
        final Campaign campaign = campaignClient.getCampaign(campaignId);
        final Survey survey = campaignClient.getSurvey(campaign.getSurveyId());
        exportCampaignService.sendResults(campaign, survey);
    }
}

