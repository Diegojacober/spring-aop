package br.com.diegojacober.aspects_java_springaop.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void hello() {
        System.out.println("Hello");
    }
}
