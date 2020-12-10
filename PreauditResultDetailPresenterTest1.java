package com.wuba.carfinancial.pretrialaudit.presenter;

import com.wuba.carfinancial.pretrialaudit.api.PretrialAuditApi;
import com.wuba.carfinancial.pretrialaudit.bean.PreauditResultDetailResponse;
import com.wuba.carfinancial.pretrialaudit.view.PreauditResultDetailView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class PreauditResultDetailPresenterTest1 {
    @Mock
    PretrialAuditApi testApi;
    @Mock
    PreauditResultDetailView testView;
    @Mock
    PreauditResultDetailResponse testData;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getResultDetail() {

    }

    @Test
    public void getSignUrl() {
    }
}