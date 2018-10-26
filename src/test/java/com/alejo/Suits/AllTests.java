package com.alejo.Suits;
import com.newtours.TestCases.VerifyNewtoursLogin;
import com.newtours.TestCases.VerifyNewtoursRegisterTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//Ejecutar los TestCases
@RunWith(Suite.class)
@SuiteClasses({VerifyNewtoursLogin.class,VerifyNewtoursRegisterTest.class})
public class AllTests {

}
