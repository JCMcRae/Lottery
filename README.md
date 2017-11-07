# Lottery
Small Java API for entering and randomly drawing names.

## Introduction
In order to use this application, you need to compile Lottery.java:

`javac Lottery.java`

Depending on your IDE of choice, if you so choose to use one, it will probably be able to do it for you. You just need to figure out how to do that. After it compiles, you need to convert it to a `.jar` file:

`jar -cf Lottery.jar Lottery.class`

After that, you have the API for your lotteries and giveaways.

## How it works

### add(String name)
This API utilizes a `Vector<String>` for entry and selection of your contestants. The add function merely calls the add functin of the vector.

### choose()
This function chooses a random winner for you. Because you may want to select multiple winners, all you have to do is call this function as many times as you need or want.
