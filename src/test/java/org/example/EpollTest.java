package org.example;

import io.netty.channel.epoll.Epoll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EpollTest {

	@Test
	void epollAvailable() {
		assertTrue(Epoll.isAvailable());
	}
}
