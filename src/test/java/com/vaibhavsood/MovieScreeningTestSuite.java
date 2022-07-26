package com.vinmayiswamy;

import com.vinmayiswamy.business.service.ScreeningServiceIntegrationTest;
import com.vinmayiswamy.data.repository.ScreeningRepositoryIntegrationTest;
import com.vinmayiswamy.web.application.ScreeningControllerIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ScreeningServiceIntegrationTest.class, ScreeningControllerIntegrationTest.class,
        ScreeningRepositoryIntegrationTest.class})
public class MovieScreeningTestSuite {
}
