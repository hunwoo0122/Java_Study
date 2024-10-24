package org.example.day18.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q4_stream {
    public static void main(String[] args) {
        //1. 한 글자인 요소들을 필터링한 후 목록 생성
        List<String> strings= Arrays.asList("파인애플","송아지","양","스마일","소");

        List<String> one_word = strings.stream()
                .filter(word -> word.length() == 1)
                .collect(Collectors.toList());
        System.out.println(one_word);

        // 2. "jpeg"로 끝나는 요소들을 필터링한 후 목록 생성
        List<String> images = Arrays.asList("1.png","2.png","3.jpeg","4.jpeg");
        List<String> jpegImages = images.stream()
                .filter(image -> image.endsWith(".jpeg"))
                .collect(Collectors.toList());
        System.out.println(jpegImages);
    }
}
