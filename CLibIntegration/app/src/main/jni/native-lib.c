// native-lib.c
#include <jni.h>
#include <stdio.h>

JNIEXPORT jstring JNICALL
Java_com_example_clibintegration_MainActivity_stringFromJNI(JNIEnv* env, jobject /* this */) {
    return (*env)->NewStringUTF(env, "Hello from C!");
}
