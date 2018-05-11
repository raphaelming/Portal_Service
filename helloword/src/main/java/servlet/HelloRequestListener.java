package servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


@Slf4j
public class HelloRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("************** request destroy **************");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("************** request init **************");
    }
}