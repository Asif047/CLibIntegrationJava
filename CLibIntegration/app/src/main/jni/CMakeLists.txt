# CMakeLists.txt
cmake_minimum_required(VERSION 3.4.1)

add_library( # Sets the name of the library.
        native-lib

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        native-lib.c )

# Specifies libraries CMake should link to your target library.
target_link_libraries( # Specifies the target library.
        native-lib

        # Links the target library to the log library
        # included in the NDK.
        log )
