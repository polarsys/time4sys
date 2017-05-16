local_mkfile_path:=$(abspath $(lastword $(MAKEFILE_LIST)))
local_current_dir :=$(dir $(local_mkfile_path))

MARTE_DOCS_DIR:=$(realpath $(local_current_dir))/
MARTE_OBJ:=$(MARTE_DOCS_DIR)Marte.html $(MARTE_DOCS_DIR)Marte.pdf

all: $(MARTE_OBJ)

martedistclean:
	rm -f  $(MARTE_OBJ)

distclean: martedistclean

