## ImageOptimize

ImageOptimize 是基于Python3实现的，可对文件目录中的jpg和png图片批量进行Tiny压缩的脚本工具。该脚本能够扫描指定目录下所有的文件，并检测其中的jpg和png图片，将其上传到Tiny服务器进行压缩处理，而后下载压缩后的图片，覆盖原有图片，并对压缩后的图片打上特定的标识，以防止下次重新进行压缩该图片。

##### Depends On

* [Python3](https://www.python.org/download/releases/3.0/) (>= 3.5)
* [Pillow](https://pypi.python.org/pypi/Pillow/5.0.0) (>= 5.0.0)
* [Piexif](https://pypi.python.org/pypi/piexif) (>=1.1.0)
* [Requests](https://pypi.python.org/pypi/requests) (>=2.18.0)
* [threadpool](https://pypi.python.org/pypi/threadpool/1.3.2)(>=1.3.2)

##### Getting started

```shell
python3 ./optimizemain.py --token=<tokenFile> [--path=<path>] [--ignore=<ignoreFile>]
```

* tokenFile：保存从[Tiny](https://tinypng.com/developers)上注册的token，一行一个，以 '#'开头的行为注释
* path：需要扫描的根目录
* ignoreFile：需要忽略文件或文件夹的配置列表，一行为一个规则，支持正则表达式，以 '#'开头的行为注释

##### 实现说明

[批量图片压缩实现](https://ljsalm089.github.io/2018/04/23/%E6%89%B9%E9%87%8F%E5%9B%BE%E7%89%87%E5%8E%8B%E7%BC%A9%E5%AE%9E%E7%8E%B0/)