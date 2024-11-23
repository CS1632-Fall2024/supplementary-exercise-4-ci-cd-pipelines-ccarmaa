package edu.pitt.cs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



public class ValueTest {
	Value value;

	@Before
	public void setUp() {
		value = Mockito.mock(Value.class);
	}
	
	@Test
	public void testIncValNone() {
		Mockito.when(value.getVal()).thenReturn(0);
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {
		value.incVal();
		Mockito.when(value.getVal()).thenReturn(1);
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		value.incVal();
		value.incVal();
		Mockito.when(value.getVal()).thenReturn(2);
		assertEquals(2, value.getVal());
	}
}

