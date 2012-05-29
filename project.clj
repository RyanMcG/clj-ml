(defproject org.clojars.ryanmcg/clj-ml "0.2.2-SNAPSHOT"
  :description "Machine Learning library for Clojure built around Weka and friends"
  :repositories {"leadtune-repo" "http://c0026236.cdn1.cloudfiles.rackspacecloud.com/repo"}
  :aoc "src/java"
  :javac-fork "true"
  :warn-on-reflection true
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [incanter/incanter-core "1.3.0-SNAPSHOT"]
                 [incanter/incanter-charts "1.3.0-SNAPSHOT"]
                 [lt/weka "3.6.3"]
                 [hr.irb/fastRandomForest "0.98"]])
