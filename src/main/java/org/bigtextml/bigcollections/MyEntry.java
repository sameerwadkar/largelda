/* Copyright (C) 2014 Sameer Wadkar.
This file is an adaptation to the  "MALLET" (MAchine Learning for LanguagE Toolkit)
It is adapted from the "MALLET" (MAchine Learning for LanguagE Toolkit) API  by, 
McCallum, Andrew Kachites-  "MALLET: A Machine Learning for Language Toolkit."
http://mallet.cs.umass.edu. 2002.
http://www.cs.umass.edu/~mccallum/mallet
This software is provided under the terms of the Common Public License,
version 1.0, as published by http://www.opensource.org.  For further
information, see the file `LICENSE' included with this distribution. */
package org.bigtextml.bigcollections;
public class MyEntry<K, V> implements java.io.Serializable{
	  private final K key;
	  private V value;

	  public MyEntry(K key, V value) {
	    this.key = key;
	    this.value = value;
	  }

	  public K getKey() {
	    return key;
	  }

	  public V getValue() {
	    return value;
	  }

	  public void setValue(V value) {
	    this.value = value;
	  }
	} 