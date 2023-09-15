# Collection Framework API
- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.
- O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: `List` (lista), `Set` (conjunto), `Queue` (fila) e `Map` (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

<img src="https://github.com/cami-la/collections-java-api-2023/blob/master/assets/image/collection-framework.png?raw=true">

Modifier and Type | Method | Description
| -- | -- | -- |
`boolean` | add(E e) | Ensures that this collection contains the specified element (optional operation).
`boolean` | addAll(Collection<? extends E> c) | Adds all of the elements in the specified collection to this collection (optional operation).
`void` | clear() | Removes all of the elements from this collection (optional operation).
`boolean` | contains(Object o) | Returns true if this collection contains the specified element.
`boolean` | containsAll(Collection<?> c) | Returns true if this collection contains all of the elements in the specified collection.
`boolean` | equals(Object o) | Compares the specified object with this collection for equality.
`int` | hashCode() | Returns the hash code value for this collection.
`boolean` | isEmpty() | Returns true if this collection contains no elements.
`Iterator<E>` | iterator() | Returns an iterator over the elements in this collection.
`default Stream<E>` | parallelStream() | Returns a possibly parallel Stream with this collection as its source.
`boolean` | remove(Object o) | Removes a single instance of the specified element from this collection, if it is present (optional operation).
`boolean` | removeAll(Collection<?> c) | Removes all of this collection's elements that are also contained in the specified collection (optional operation).
`default boolean` | removeIf(Predicate<? super E> filter) | Removes all of the elements of this collection that satisfy the given predicate.
`boolean` | retainAll(Collection<?> c) | Retains only the elements in this collection that are contained in the specified collection (optional operation).
`int` | size() | Returns the number of elements in this collection.
`default Spliterator<E>` | spliterator() | Creates a Spliterator over the elements in this collection.
`default Stream<E>` | stream() | Returns a sequential Stream with this collection as its source.
`Object[]` | toArray() | Returns an array containing all of the elements in this collection.
`default <T> T[]` | toArray(IntFunction<T[]> generator) | Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array.
`<T> T[]` | toArray(T[] a) | Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.

# Generics Type
- Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
- A classe `Box` a seguir será modificada para demonstrar o conceito:
```java
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
```
- O símbolo <> é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
- Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código public class Box para public class Box<T>.
- Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:
```java
/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
*/
public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```
- Como você pode ver, todas as ocorrências de Object são substituídas por T.
- Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.
- Essa mesma técnica pode ser aplicada para criar interfaces genérica.
- Os nomes de parâmetros de tipo mais comumente usados são:
    - E - Elemento (usado extensivamente pelo Java Collections Framework)
    - K - Chave
    - N - Número
    - T - Tipo
    - V - Valor
    - S, U, V, etc. - 2º, 3º, 4º tipos
Vantagens simples de usar generics nas interfaces Collection em Java:
1. Segurança do tipo de dados: O uso de generics garante que apenas objetos de um tipo específico possam ser adicionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.
2. Código mais legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.
3. Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.
4. Reutilização de código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.
5. Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.

# Comparable X Comparator
## Comparable
- `Comparable` fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
- `Comparable` afeta a classe original, ou seja, a classe atual é modificada.
- `Comparable` fornece o método `compareTo()` para ordenar elementos.
- `Comparable` está presente no pacote `java.lang`.
- Podemos ordenar os elementos da lista do tip`` Comparable` usando o método `Collections.sort`(List).

## Comparator
- O `Comparator` fornece o método `compare()` para ordenar elementos.
- O `Comparator` fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.
- O `Comparator` não afeta a classe original, ou seja, a classe atual não é modificada.
- Um `Comparator` está presente no pacote ``javautil`.
- Podemos ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(List, Comparator)`.

## Collections
- A classe `Collections` é uma classe utilitária do Java para operações comuns em coleções.
- Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.
- O método `sort()` é usado para ordenar uma lista em ordem ascendente.
- O método `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente.

```java
package main.java.comparableXcomparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}

	// Usado para ordenar livros por ano
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}

	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
}

// Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
```
```java
package main.java.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
				add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
						"Raoul-Gabriel Urma e  Richard Warburton", 2021));
				add(new Livro(
						"Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
						"Susan J. Fowler", 2017));
				add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
						"Aditya Y. Bhargava", 2017));
				add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
			}
		};

		
		System.out.println("Livros após a ordenação natural (Título): ");
		Collections.sort(livros);
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
					livro.getAutor() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getTitulo() + " - " +
					livro.getAutor());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por autor: ");
		Collections.sort(livros, new CompararAutor());
		for (Livro livro : livros) {
			System.out.println(livro.getAutor() + " - " +
					livro.getTitulo() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano, autor e título: ");
		Collections.sort(livros, new CompararAnoAutorTitulo());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getAutor() + " - " +
					livro.getTitulo());
		}
	}
}
```