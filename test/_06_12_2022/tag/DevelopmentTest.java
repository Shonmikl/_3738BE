package _06_12_2022.tag;

import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(value = JUnitPlatform.class)
@SelectPackages("_06_12_2022.tag")
@IncludeTags("development")
public class DevelopmentTest {

}