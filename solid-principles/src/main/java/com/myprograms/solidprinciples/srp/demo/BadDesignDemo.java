package com.myprograms.solidprinciples.srp.demo;

/*Let's assume we need to keep a Media object. At first, it looks fine. But if we take a look, we can see that this media class
* has two responsibilities i.e. two reasons to change. They are
* 1. Media type may be changed (Audio, Video, etc.) So we have to modify the class when we have to add a new type
* 2. WriteTo() can be used to save to the file in Google Drive as well. Hence we have to change the code
*
* This Media class is against Single Responsibility Principle(SRP). A class should have one and only one reason to change*/

public class BadDesignDemo {
}
