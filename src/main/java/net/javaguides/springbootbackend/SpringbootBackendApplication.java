package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.entity.Entry;
import net.javaguides.springbootbackend.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EntryRepository entryRepository;

	@Override
	public void run(String... args) {

		this.entryRepository.saveAll(this.getEntries());
	}

	private List<Entry> getEntries() {

		return List.of(
				new Entry(
						"First Entry",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2021,12,28)),
				new Entry(
						"Second Entry",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2021,12,29)),
				new Entry(
						"Third Entry",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2010,12,30)),
				new Entry(
						"Fourth Entry",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2021,12,31)),
				new Entry(
						"Fifth Entry",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2022,1,1)),
				new Entry(
						"Going to the cinema",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2022,1,2)),
				new Entry(
						"eating ice cream",
						"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium."
				)
						.setCreationDate(LocalDate.of(2022,1,3))
		);
	}
}
