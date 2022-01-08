package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.entity.Entry;
import net.javaguides.springbootbackend.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EntryRepository entryRepository;

	@Override
	public void run(String... args) throws Exception {

		Entry entry1 = Entry.builder()
				.headline("First Entry")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry2 = Entry.builder()
				.headline("Eating Icecream")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry3 = Entry.builder()
				.headline("Zoo")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry4 = Entry.builder()
				.headline("Day 4")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry5 = Entry.builder()
				.headline("Apple")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry6 = Entry.builder()
				.headline("Great Being here")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry7 = Entry.builder()
				.headline("Everything sucks")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry8 = Entry.builder()
				.headline("New Mission")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry9 = Entry.builder()
				.headline("Captain's Log")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry10 = Entry.builder()
				.headline("Meow")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry11 = Entry.builder()
				.headline("BUMBUM")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry12 = Entry.builder()
				.headline("Hey")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry13 = Entry.builder()
				.headline("Day 13")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry14 = Entry.builder()
				.headline("Puhh what a day")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		Entry entry15 = Entry.builder()
				.headline("Zoo again")
				.entry("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.")
				.creationDate(LocalDate.now())
				.build();

		entryRepository.save(entry1);
		entryRepository.save(entry2);
		entryRepository.save(entry3);
		entryRepository.save(entry4);
		entryRepository.save(entry5);
		entryRepository.save(entry6);
		entryRepository.save(entry7);
		entryRepository.save(entry8);
		entryRepository.save(entry9);
		entryRepository.save(entry10);
		entryRepository.save(entry11);
		entryRepository.save(entry12);
		entryRepository.save(entry13);
		entryRepository.save(entry14);
		entryRepository.save(entry15);


	}
}
