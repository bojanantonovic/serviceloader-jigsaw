package serviceconsumer;

import disneyworld.service.DisneyWorldMember;

import java.util.ServiceLoader;

public class Main {

	public static void main(String... args) {
		final var serviceLoader = ServiceLoader.load(DisneyWorldMember.class);

		// as iterable
		for (final var dwm : serviceLoader) {
			System.out.println(dwm.getName());
		}

		// as stream
		serviceLoader.stream().map(ServiceLoader.Provider::get).map(DisneyWorldMember::getName).forEach(System.out::println);
	}
}
