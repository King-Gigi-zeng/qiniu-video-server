package com.hnit.video.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import com.hnit.video.common.utils.Result;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {
    public static void out(HttpServletResponse response, Result result) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
            mapper.writeValue(response.getWriter(), result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}