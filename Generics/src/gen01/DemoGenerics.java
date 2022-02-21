package gen01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoGenerics {

	public static void main(String[] args) {
		/**
		 * List is a raw type.
		 * 
		 * Seit Java 1.5 sind Generics dabei.
		 * 
		 * Seit Java 1.7 gibt es den Diamond Operator. Typ Inferenz, das Objekt kann den
		 * Paramter aus der Refenrenz ableiten.
		 * 
		 * Seit Java 9 kann der Diamond Operator auch für innere Anonyme Klassen
		 * verwendet werden.
		 */
		List<String> zahlen = new ArrayList<>();
		
		List<Integer> example = new List<>() {

			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer set(int index, Integer element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void add(int index, Integer element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Integer> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Integer> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		

//		zahlen.add(42);
		zahlen.add("42");
//		zahlen.add(new DemoGenerics());

		String d01 = zahlen.get(0);

	}

}
