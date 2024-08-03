package br.com.diegojacober.aspects_java_springaop.dummy;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
    public void dummy() {
        System.out.println("dummy");
    }
}
