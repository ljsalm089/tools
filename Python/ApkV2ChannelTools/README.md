##### **ApkV2ChannelTools**

ApkV2ChannelTools是基于Python3实现的，可对使用了Signature Scheme v2进行签名的apk添加一些额外信息的工具脚本，当前用于对v2签名apk添加渠道信息，其主要实现原理是在apk的signing block上添加上对应的key-value，从而达到添加额外信息的效果；需注意的是signing block上保存的key仅可以为4byte的数据。

###### **Getting started**

```shell
python3 ./apkv2channeltools.py --source-apk=<sourceApk> --channels=<channelsFile> [--target-dir=<targetDir>] [--format=<formatStr>]
```

* sourceApk: 使用scheme v2签名的apk
* channelsFile：保存渠道信息的文件，一行为一个渠道，以'#'开头的行为注释
* targetDir：生成的渠道包保存目录
* formatStr：生成渠道包的文件名格式，（如：app-%s.apk， 其中%s表示渠道的占位符）
* exit code：返回1表示参数错误，返回2表示apk并非使用scheme v2签名，生成成功则返回0