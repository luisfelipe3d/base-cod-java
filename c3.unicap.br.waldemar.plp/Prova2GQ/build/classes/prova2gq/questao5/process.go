package main

import (
    "fmt"
    "syscall"
)

func main() {

    var sI syscall.StartupInfo
    var pI syscall.ProcessInformation

    argv := syscall.StringToUTF16Ptr("c:\\windows\\system32\\calc.exe")

    err := syscall.CreateProcess(
        nil,
        argv,
        nil,
        nil,
        true,
        0,
        nil,
        nil,
        &sI,
        &pI)

    fmt.Printf("Return: %d\n", err)