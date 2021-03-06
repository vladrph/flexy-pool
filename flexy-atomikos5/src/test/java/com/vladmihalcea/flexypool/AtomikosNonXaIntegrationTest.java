package com.vladmihalcea.flexypool;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AtomikosIntegrationTest - Atomikos Integration Test
 *
 * @author Vlad Mihalcea
 * @since 2.2.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-non-xa-test.xml")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class AtomikosNonXaIntegrationTest extends AbstractPoolAdapterIntegrationTest {
}
