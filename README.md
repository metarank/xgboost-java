# XGBoost minimal java bindings

[![CI Status](https://github.com/metarank/xgboost-java/workflows/CI/badge.svg)](https://github.com/metarank/xgboost-java/actions)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.metarank/xgboost-java_2.13/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/io.github.metarank/xgboost-java_2.13)
[![License: Apache 2](https://img.shields.io/badge/License-Apache2-green.svg)](https://opensource.org/licenses/Apache-2.0)

### Main differences

* no Scala support: original bindings depend on spark & flink, which cannot be used yet with Scala 2.13.
* simplified dependencies: 
  * akka-actor: as there is no scala support
  * kryo: as it uses an ancient version of kryo which conflicts with 5.x
  * commons-logging replaced with more typical slf4j-api
  * optional hadoop dependency is now 2.10.x instead of 2.7.x
    

### Usage

For maven, use the following snippet:
```xml
<dependency>
  <groupId>io.github.metarank</groupId>
  <artifactId>xgboost-java</artifactId>
  <version>1.3.3-2</version>
</dependency>
```

### License

This project is released under the Apache 2.0 license, as specified in the LICENSE file.
