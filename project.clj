(defproject cljsworkshop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.8.0"]

                 ;; Backend dependencies
                 [compojure "1.5.0"]

                 [ring/ring-core "1.4.0" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-servlet "1.4.0" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-defaults "0.2.0" :exclusions [javax.servlet/servlet-api]]

                 [cc.qbits/jet "0.7.8"]]

  :plugins [[lein-ancient "0.6.10"]]
  :source-paths ["src/clj"]
  :main cljsworkshop.core)
