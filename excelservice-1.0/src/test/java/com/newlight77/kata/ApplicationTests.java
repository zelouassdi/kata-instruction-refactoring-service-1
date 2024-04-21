package com.newlight77.kata;

import com.newlight77.kata.survey.service.ExportCampaignServiceTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(ExportCampaignServiceTest.class)
class ApplicationTests {
	private ExportCampaignServiceTest exportCampaignServiceTest;
	@Test
	void contextLoads() {}

}
