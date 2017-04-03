package com.github.tmurakami.mockito_android_fix_922;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {
    @Test
    public void no_exception_while_creating_mock_object() {
        Mockito.mock(Context.class);
    }
}
