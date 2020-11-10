# Readme

这是一个重构练习题。待重构的内容请阅读`TODO`。

重构完成后可以用[sonarCloud.io](https://sonarcloud.io)来评价重构后的代码质量，目标是消灭所有代码坏味道(Sonar扫描的Issues)。
          
运行`analysis.sh`(Mac)或`analysis.bat`(Windows)将自动使用[sonarCloud.io](https://sonarcloud.io)进行静态代码分析。分析结果可以通过 [Refactoring-Java-Kata on sonarcloud.io](https://sonarcloud.io/dashboard?id=refactoring-java-kata)  获取。
          
如果SonarCloud已经不支持Java8（2020年10月），请自行修改`pom.xml`，将`maven.compiler`改为11，并安装Java11本地开发环境。
