(defproject io.pithos/pithos-quickstart "0.7.0"
  :description "pithos and cassandra, bundled together"
  :url "http://pithos.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main io.pithos.quickstart
  :dependencies [[org.clojure/clojure                "1.7.0-alpha2"]
                 [io.pithos/pithos                   "0.7.0"]
                 [org.apache.cassandra/cassandra-all "2.1.1"]])