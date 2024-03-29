package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	// Atributos
	private LocalDateTime start;
	private LocalDateTime finish;
	private Vehicle vehicle;
	private Invoice invoice;
	
	// Metodos Especiais

	// Metodos Especificos
	public CarRental() {
		super();
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		super();
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFisish() {
		return finish;
	}

	public void setFisish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
