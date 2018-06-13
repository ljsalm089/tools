##### **ApkV2ChannelTools**

ApkV2ChannelTools是基于Python3实现的，可对使用了Signature Scheme v2进行签名的apk添加一些额外信息的工具脚本，当前用于对v2签名apk添加渠道信息，其主要实现原理是在apk的signing block上添加上对应的key-value，从而达到添加额外信息的效果；需注意的是signing block上保存的key仅可以为4byte的数据。

##### Depends On

* [Python3](https://www.python.org/download/releases/3.0/) (>= 3.5)

###### **Getting started**

```shell
python3 ./apkv2channeltools.py --source-apk=<sourceApk> --channels=<channelsFile> [--target-dir=<targetDir>] [--format=<formatStr>]
```

* sourceApk: 使用scheme v2签名的apk
* channelsFile：保存渠道信息的文件，一行为一个渠道，以'#'开头的行为注释
* targetDir：生成的渠道包保存目录
* formatStr：生成渠道包的文件名格式，（如：app-%s.apk， 其中%s表示渠道的占位符）
* exit code：返回1表示参数错误，返回2表示apk并非使用scheme v2签名，生成成功则返回0

###### 实现说明

[Android APK渠道信息写入实现和读取](https://ljsalm089.github.io/2018/04/02/Android-APK%E6%B8%A0%E9%81%93%E4%BF%A1%E6%81%AF%E5%86%99%E5%85%A5%E5%AE%9E%E7%8E%B0/)