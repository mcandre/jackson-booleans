package us.yellosoft.jacksonbooleans;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class PatientTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void testJacksonSerializable() throws Exception {
        final Patient expected = new Patient();
        expected.setSmoker(true);
        expected.setLiving(Boolean.TRUE);

        final String json = OBJECT_MAPPER.writeValueAsString(expected);

        final Patient observed = OBJECT_MAPPER.readValue(json, Patient.class);

        Assert.assertEquals(expected, observed);
    }
}
