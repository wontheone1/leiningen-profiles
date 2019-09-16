{:user {:aliases {"test-ancient" "midje"
                  "upgrade-deps" ["ancient" "upgrade" ":all" ":check-clojure"]}
        :plugins [[lein-alembic "0.1.0"]
                  [cider/cider-nrepl "0.22.0-beta1"]
                  [jonase/eastwood "0.3.6"]
                  [lein-ancient "0.6.15"]
                  [lein-bikeshed "0.5.2"]
                  [lein-kibit "0.1.7"]
                  [lein-midje "3.2.1"]
                  [lein-nsorg "0.3.0"]
                  [lein-pprint "1.2.0"]
                  [venantius/yagni "0.1.7"]
                  ]
        :dependencies [
                       [slamhound "1.3.1"]
                       [org.clojure/tools.nrepl "0.2.13"]
                       [org.clojure/tools.trace "0.7.10"]
                      ]
        :bikeshed {:max-line-length 120
                   :docstrings      false}}}
