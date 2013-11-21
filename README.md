SteamKit-Java
=============
SteamKit-Java, is a java port of a library written for interfacing directly with various parts of the Steam network.

The major connection functionality exists, but there are plenty of functions I haven't tested yet.

You must include bouncycastle as a dependency to allow encryption of the packets.

Make sure you install the [JCE](http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html).

You can test it with:

    System.out.println(Cipher.getMaxAllowedKeyLength("AES"));

If that prints 128, you don't have JCE installed properly and a test will fail.