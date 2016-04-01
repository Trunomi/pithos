(defproject io.pithos/pithos-quickstart "0.7.4-trunomi0"
  :description "pithos and cassandra, bundled together"
  :url "http://pithos.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main io.pithos.quickstart
  :dependencies [[io.pithos/pithos                   "0.7.4-trunomi0"]
                 [org.apache.cassandra/cassandra-all "2.1.5"
                  :exclusions [org.slf4j/slf4j-api
                               org.slf4j/slf4j-log4j12]]])
