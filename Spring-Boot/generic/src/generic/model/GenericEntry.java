package generic.model;

import java.io.Serializable;
import java.util.Optional;

import interfaces.Rankable;

public class GenericEntry<T> {
	private T data;
	private int rank;

	public GenericEntry(int rank) {
		this.rank = rank;
	}

	public GenericEntry(T data, int rank) {
		this.data = data;
		this.rank = rank;
	}

	public <E extends Rankable & Serializable> GenericEntry(E element) {
		this.data = (T) element;
		this.rank = element.getRank();
	}

	public GenericEntry(Optional<? extends Rankable> optional) {
		if (optional.isPresent()) {
			this.data = (T) optional.get();
			this.rank = optional.get().getRank();
		}
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
