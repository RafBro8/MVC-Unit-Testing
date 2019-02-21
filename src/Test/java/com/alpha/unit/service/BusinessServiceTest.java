package com.alpha.unit.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private BusinessService businessService;

    @Test
    public void calculateSum_basicCalc() {

        int actualResult = businessService.calculateSum(new int[] {1, 2, 3});
        int expectedResult = 6;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void calculateSum_emptyArr() {

        int actualResult = businessService.calculateSum(new int[] {});
        int expectedResult = 0;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void calculateSum_oneValue() {

        int actualResult = businessService.calculateSum(new int[] {5});
        int expectedResult = 5;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void calculateSumUsingDataService_basicCalc() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {1, 2, 3, 4});
        businessService.setDataService(dataService);

        int actualResult = businessService.calculateSumUsingDataService();
        int expectedResult = 10;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void calculateSumUsingDataService_emptyArr() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {});
        businessService.setDataService(dataService);

        int actualResult = businessService.calculateSumUsingDataService();
        int expectedResult = 0;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {8});
        businessService.setDataService(dataService);

        int actualResult = businessService.calculateSumUsingDataService();
        int expectedResult = 8;

        assertThat(actualResult).isEqualTo(expectedResult);
        }
    }
