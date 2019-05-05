package isc

import (
	"math/rand"
	"time"
	"github.com/Myriad-Dreamin/go-mpt"
)


type Address []byte

type NSBApplication struct {
	IscOwners          [][]byte                        `json:"isc_owners"`
	Funds              []uint32                        `json:"required_funds"`
	VesSig             []byte                          `json:ves_signature`
	TransactionIntents []transaction.TransactionIntent `json: transactionIntents`
	value 		   uint
}
// 0x637265617465495343197b226973635f6f776e657273223a5b22456a525765413d3d222c22456a5257654a6f3d225d2c2272657175697265645f66756e6473223a5b302c305d2c22566573536967223a22497a4d3d222c225472616e73616374696f6e496e74656e7473223a5b7b2266726f6d223a22456a525765413d3d222c22746f223a22456a5257654a6f3d222c22736571223a302c22616d74223a302c226d657461223a2249673d3d227d5d7d

func (nsb *NSBApplication) createISC(byteJson []byte) (types.ResponseDeliverTx) {
	var req RequestCreateISC
	err := json.Unmarshal(byteJson, &req)
	if err != nil {
		return types.ResponseDeliverTx{
			Code: uint32(CodeDecodeJsonError),
		}
	}
	fmt.Print(req)
	return types.ResponseDeliverTx{
		Code: uint32(CodeOK),
		Log: fmt.Sprintf("%v", req),
	}
}

func (nsb *NSBApplication) activeISC(byteJson []byte) (types.ResponseDeliverTx) {
	return types.ResponseDeliverTx{
		Code: uint32(CodeOK),
	}
}

func (nsb *NSBApplication) active(value uint) (types.ResponseDeliverTx) {
	return types.ResponseDeliverTx{
		Code: uint32(CodeOK),
	}
}